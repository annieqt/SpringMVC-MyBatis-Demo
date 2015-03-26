package com.springapp.mvc.controller;

import com.springapp.mvc.model.User;
import com.springapp.mvc.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Tian Wang on 2015/3/24.
 */

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper userDao;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String listUsers(ModelMap model) {
        model.addAttribute("user", new User());
        model.addAttribute("users", userDao.findAll());
        return "redirect:/";
    }

    /**
     *
     * @return users in json
     */
    @ResponseBody
    @RequestMapping(value="/json", method = RequestMethod.GET)
    public  List<User> listUsers() {
        List<User> users = userDao.findAll();
        return users;
    }

    @ResponseBody
    @RequestMapping(value="/{userId}", method = RequestMethod.GET)
    public User findUser(@PathVariable("userId") int userId) {
        User user = userDao.findById(userId);
        return user;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user") User user, BindingResult result) {
        userDao.add(user);
        return "redirect:/";
    }

    @RequestMapping("/delete/{userId}")
    public String deleteUser(@PathVariable("userId") int userId) {
        userDao.delete(userId);
        return "redirect:/";
    }
}
