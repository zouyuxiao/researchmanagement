package service;

import com.zhuoyue.researchManement.bean.UnitTree;
import com.zhuoyue.researchManement.service.UnitTreeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml", "classpath:spring-mvc.xml"})
@ActiveProfiles("dev")
public class UnitTreeServiceTest {

    @Autowired
    private UnitTreeService unitTreeService;

    @Test
    public void insert() {

        Long parentId = 202L;
        for (long i = 401; i <= 466; i++) {
            UnitTree tree = new UnitTree();
            tree.setParentId(parentId);
            tree.setUnitId(i);
            tree.setLevel(3);
            tree.setSort("");
            unitTreeService.insert(tree);
        }

    }
}
