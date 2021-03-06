package com.neo.Service;

import com.neo.domain.User;
import com.neo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public class UserService{
    @Autowired
    private UserRepository userRepository;
    public  User findByUserName(String userName){
        return userRepository.findByUserName(userName);
    }
    public User findByUserNameOrEmail(String username, String email){
        return userRepository.findByUserNameOrEmail(username,email);
    }

    public int modifyById(String  userName, Long id){
        return userRepository.modifyById(userName,id);
    }

    public void deleteById(Long id){
         userRepository.deleteById(id);
    }

    public User findByEmail(String email){
        return userRepository.findByEmail(email);
    }

    public Page<User> findALL(Pageable pageable){
        return  userRepository.findALL(pageable);
    }
    public Page<User> findByNickName(String nickName, Pageable pageable){
        return userRepository.findByNickName(nickName,pageable);
    }
}
