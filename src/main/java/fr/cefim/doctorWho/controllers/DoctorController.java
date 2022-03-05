package fr.cefim.doctorWho.controllers;

import fr.cefim.doctorWho.models.Doctor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Arrays;

@Controller
public class DoctorController {

    @GetMapping("/doctors/{id}")
    public String doctors(@PathVariable("id") int id, Model model) {
        model.addAttribute("doctors", Arrays.asList(
                new Doctor(1, "William Hartnell", "1-william_hartnell.jpg", "https://fr.wikipedia.org/wiki/William_Hartnell"),
                new Doctor(2, "Patrick Troughton", "2-patrick_troughton.jpg", "https://fr.wikipedia.org/wiki/Patrick_Troughton"),
                new Doctor(3, "Jon Pertwee", "3-jon_pertwee.jpg", "https://fr.wikipedia.org/wiki/Jon_Pertwee"),
                new Doctor(4, "Tom Baker", "4-tom_baker.jpg", "https://fr.wikipedia.org/wiki/Tom_Baker_(acteur)"),
                new Doctor(5, "Peter Davison", "5-peter_davison.jpg", "https://fr.wikipedia.org/wiki/Peter_Davison"),
                new Doctor(6, "Colin Baker", "6-colin_baker.jpg", "https://fr.wikipedia.org/wiki/Colin_Baker"),
                new Doctor(7, "Sylvester McCoy", "7-sylvester_mccoy.jpg", "https://fr.wikipedia.org/wiki/Sylvester_McCoy"),
                new Doctor(8, "Paul McGann", "8-paul_mcgann.jpg", "https://fr.wikipedia.org/wiki/Paul_McGann"),
                new Doctor(9, "John Hurt", "9-john_hurt.jpg", "https://fr.wikipedia.org/wiki/Docteur_de_la_guerre"),
                new Doctor(10, "Christopher Eccleston", "10-christopher_eccleston.jpg", "https://fr.wikipedia.org/wiki/Christopher_Eccleston"),
                new Doctor(11, "David Tennant", "11-david_tennant.jpg", "https://fr.wikipedia.org/wiki/David_Tennant"),
                new Doctor(12, "Matt Smith", "12-matt_smith.jpg", "https://fr.wikipedia.org/wiki/Matt_Smith_(acteur)"),
                new Doctor(13, "Peter Capaldi", "13-peter_capaldi.jpg", "https://fr.wikipedia.org/wiki/Peter_Capaldi"),
                new Doctor(14, "Jodie Whittaker", "14-jodie_whittaker.jpg", "https://fr.wikipedia.org/wiki/Jodie_Whittaker")
        ));
        return "doctors";
    }
}
