package com.askevy.ecom.controller;
import com.askevy.ecom.model.UserDetailsBean;
import com.askevy.ecom.service.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserDetailsController {

    @Autowired
    UserDetailService userDetailService;

    @RequestMapping(value = "/getData",method = RequestMethod.GET)
    public ResponseEntity<?> getUserData()
    {
        Optional<List<UserDetailsBean>> userDetailsBeans = Optional.of(userDetailService.getUserData());
        try{
            if(userDetailsBeans.isPresent())
                return new ResponseEntity<>(userDetailsBeans.get(), HttpStatus.OK);
            else
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        catch (Exception ex){
            return new ResponseEntity<>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
