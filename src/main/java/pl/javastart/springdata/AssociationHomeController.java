package pl.javastart.springdata;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AssociationHomeController {

    private HomeRepository homeRepository;
    private AssociationHomeRepository associationHomeRepository;

    public AssociationHomeController(HomeRepository homeRepository, AssociationHomeRepository associationHomeRepository) {
        this.homeRepository = homeRepository;
        this.associationHomeRepository = associationHomeRepository;
    }


    @GetMapping("/")
    public String main(Model model) {
        List<AssociationHome> associationHomes;
        associationHomes = associationHomeRepository.findAll();

        List<Home> homes;
        homes = homeRepository.findAll();

        model.addAttribute("associations", associationHomes);
        model.addAttribute("homes", homes);
        return "index";
    }
}
