package rs.malkier.github_actions_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zdravo")
public class Kontroler {

  @GetMapping
  public String hello() {
    return "Ja sam cvetak";
  }

  @GetMapping("/vatrogasac")
  public String hello2() {
    return "cudan cvetak";
  }
}
