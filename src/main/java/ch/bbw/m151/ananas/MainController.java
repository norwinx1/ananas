package ch.bbw.m151.ananas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class MainController {
    private final PineappleRepository pineappleRepository;
    @PersistenceContext
    public EntityManager em;

    @Autowired
    public MainController(PineappleRepository pineappleRepository) {
        this.pineappleRepository = pineappleRepository;
    }

    //4.a
    @PostMapping("/findAllByTypeEqualsAndQualityEquals")
    public List<PineappleEntity> findAllByTypeEqualsAndQualityEquals(@RequestBody PineappleEntity ananas) {
        return pineappleRepository.findAllByTypeEqualsAndQualityEquals(ananas.getType(), ananas.getQuality());
    }

    //4.b
    @GetMapping("/findAllLimit")
    public List<PineappleEntity> findAllLimit(@PathParam("limit") Integer limit) {
        return pineappleRepository.findAll(Pageable.ofSize(limit)).getContent();
    }

    //4.c
    @DeleteMapping("/deleteById")
    public void deleteById(@PathParam("id") Integer id) {
        pineappleRepository.deleteByIdEquals(id);
    }

    //4.d
    @GetMapping("/findAll")
    public List<PineappleEntity> findAll() {
        return pineappleRepository.findAll();
    }

    //4.e
    @GetMapping("/getWeights")
    public List<Integer> getWeights() {
        return pineappleRepository.getWeights();
    }

    //Bonus
    @GetMapping("/sqlInjection")
    public List<Integer> sqlInjection(@PathParam("id") String id) {
        String jql = "SELECT id FROM FarmerEntity WHERE id = '" + id + "'";
        TypedQuery<Integer> q = em.createQuery(jql, Integer.class);
        return q.getResultList();
    }
}
