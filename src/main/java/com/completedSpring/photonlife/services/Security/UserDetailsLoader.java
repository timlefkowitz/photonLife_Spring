package com.completedSpring.photonlife.services.Security;

import com.completedSpring.photonlife.models.Users.User;
import com.completedSpring.photonlife.models.Users.UserWithRoles;
import com.completedSpring.photonlife.repos.UsersRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsLoader implements UserDetailsService {

    private final UsersRepository usersDao;

    public UserDetailsLoader(UsersRepository usersDao) {
        this.usersDao = usersDao;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = usersDao.findByUsername(username);
        if(user == null){
            throw new UsernameNotFoundException("No user found for " + username);
        }
        return new UserWithRoles(user);
    }
}
