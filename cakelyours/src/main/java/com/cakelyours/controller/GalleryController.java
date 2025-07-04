package com.cakelyours.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class GalleryController {

    @GetMapping("/gallery")
    public String showGallery(Model model) {
        List<String> images = List.of("choco.jpeg", "vanilla.jpeg");  // 🖼️ Your actual image file names
        model.addAttribute("images", images);
        return "gallery";
    }
}
