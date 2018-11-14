package controller;

import com.zhuoyue.researchManement.service.UnitTreeService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml", "classpath:spring-mvc.xml"})
@WebAppConfiguration
@ActiveProfiles("test")
public class UnitTreeControllerTest {

    @Autowired
    private UnitTreeService unitTreeService;

    protected MockMvc mockMvc;

    @Autowired
    WebApplicationContext wac;

    // 这个方法在每个方法执行之前都会执行一遍
    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build(); // 初始化MockMvc对象
    }

    @Test
    public void testString()throws Exception {

    }

    @Test
    public void insert() throws Exception {

        Long parentId = 206L;
        for (long i = 801; i <= 822; i++) {
            mockMvc.perform(
                    post("/api/unit/tree/add") // 请求的url，请求的方法是get
                            .contentType(MediaType.APPLICATION_FORM_URLENCODED) // 数据的格式
                            .param("parent_id", "" + parentId) // 添加参数（可以添加多个）
                            .param("unit_id", "" + i)
            );
            System.out.println("i： " + i);
        }

    }
}
