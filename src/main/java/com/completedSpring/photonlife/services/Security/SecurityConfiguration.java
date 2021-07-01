package com.completedSpring.photonlife.services.Security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {


    private final UserDetailsLoader userLoader;

    public SecurityConfiguration(UserDetailsLoader userLoader) {
        this.userLoader = userLoader;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    //
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth)
        throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("user").password(passwordEncoder().encode("password")).roles("USER")
                .and()
                .withUser("admin").password(passwordEncoder().encode("admin")).roles("ADMIN");
    }


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .userDetailsService(userLoader) // How to find users by their username
                .passwordEncoder(passwordEncoder()) //How to encode and verify passwords
        ;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                //// Login configuration
        .formLogin()
                .loginPage("login.html")
                .defaultSuccessUrl("/home")// users home page
                .permitAll() // Anyone can goto the login page
        // Logout configuration
        .and()
                .logout()
                .logoutSuccessUrl("/login?logout") // append a query string value
        .and()
                .authorizeRequests()
                .antMatchers("/", "home")
                .permitAll()
                //Pages that require authentication
        .and()
                .authorizeRequests()
                .antMatchers(
                        "/post/create", // only authenticated user can create post
                        "/post/{id}/edit" // only authenticated users can edit post
                )
                .authenticated()
        ;
    }
}

