package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepo UserRepo;
    @Autowired
    private ModelMapper modelMapper;

    public UserDTO saveUser(UserDTO UserDTO){
        UserRepo.save(modelMapper.map(UserDTO, User.class));
        return UserDTO;
    }

    public List<UserDTO> getALLUsers(){
        List<User>userList=UserRepo.findAll();
        return modelMapper.map(userList,new TypeToken<List<UserDTO>>(){}.getType());
    }
    public UserDTO UpdateUser (UserDTO userDTO){
        UserRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }

    public boolean deleteUser(UserDTO userDTO){
        UserRepo.delete(modelMapper.map(userDTO,User.class));
        return true;
    }


}
