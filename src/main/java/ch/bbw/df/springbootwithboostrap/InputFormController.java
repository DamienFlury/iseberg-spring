package ch.bbw.df.springbootwithboostrap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class InputFormController {
    @GetMapping("/add-reservation")
    public String addReservation(Model model) {
        model.addAttribute("reservation", new Reservation());
        return "add-reservation";
    }

    @PostMapping("/add-reservation")
    public String showReservation(@ModelAttribute Reservation reservation) {
        return "result";
    }
}