package pl.javastart.springdata;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

    private HomeRepository homeRepository;
    private AssociationHomeRepository associationHomeRepository;

    public HomeController(HomeRepository homeRepository, AssociationHomeRepository associationHomeRepository) {
        this.homeRepository = homeRepository;
        this.associationHomeRepository = associationHomeRepository;
    }
}

