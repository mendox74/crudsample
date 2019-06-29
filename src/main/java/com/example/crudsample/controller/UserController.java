package com.example.crudsample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.crudsample.domain.User;
import com.example.crudsample.repository.UserRepository;

@Controller
@RequestMapping("/users")

public class UserController {
	
    @Autowired
    private UserRepository userRepository;
    
   /*
    * 一覧画面の表示
    */
    @GetMapping
    public String listUsers(Model model) {
      List<User> users = userRepository.select();
      model.addAttribute("users", users);
      return "users/list";
    }
    
    /*
     * 新規登録画面の表示
     */
    @GetMapping("new")
    public String newUser(Model model) {
        return "users/new";
    }
    
    /*
     * 編集画面の表示
     */
    @GetMapping("{id}/edit")
    public String edit(@PathVariable int id, Model model) {
    	User user = userRepository.selectPK(id);
        model.addAttribute("user", user);
        return "users/edit";
    }
    
    /*
     * 参照画面の表示
     */
    @GetMapping("{id}")
    public String show(@PathVariable int id, Model model) {
    	User user = userRepository.selectPK(id);
        model.addAttribute("user", user);
        return "users/show";
    }
    
    /*
     * 新規登録の挿入
     */
    @PostMapping
    public String create(@ModelAttribute User user) {
    	userRepository.insert(user);
        return "redirect:/users";
    }
    
    /*
     * 編集情報の更新
     */
    @PutMapping("{id}")
    public String update(@PathVariable int id, @ModelAttribute User user) {
    	user.setId(id);
    	userRepository.updata(user);
        return "redirect:/users";
    }
    
    /*
     * 登録情報の削除
     */
    @DeleteMapping("{id}")
    public String destroy(@PathVariable int id) {
    	userRepository.deletePK(id);
        return "redirect:/users";
    }

}
