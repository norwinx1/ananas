package ch.bbw.m151.ananas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class MainController {
    private final PineappleRepository pineappleRepository;

    @Autowired
    public MainController(PineappleRepository pineappleRepository) {
        this.pineappleRepository = pineappleRepository;
    }

    @PostMapping("/findAllByTypeEqualsAndQualityEquals")
    public List<PineappleEntity> findAllByTypeEqualsAndQualityEquals(@RequestBody PineappleEntity ananas) {
        return pineappleRepository.findAllByTypeEqualsAndQualityEquals(ananas.getType(), ananas.getQuality());
    }

    @GetMapping("/findAll")
    public List<PineappleEntity> findAll(@PathParam("limit") Integer limit) {
        return pineappleRepository.findAll(Pageable.ofSize(limit)).getContent();
    }

    @DeleteMapping("/deleteById")
    public void deleteById(@PathParam("id") Integer id) {
        pineappleRepository.deleteByIdEquals(id);
    }
}
