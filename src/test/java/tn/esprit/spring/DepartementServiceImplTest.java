import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.services.IDepartementService;
import tn.esprit.spring.services.IEntrepriseService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartementServiceImplTest {

    @Autowired
	IEntrepriseService es;

    @Autowired
    IDepartementService deptService;

	

	@Test
	public void testAjouterDepartement() {
		Departement d = new Departement("Sopra");
		deptService.ajouterDepartement(d);
		assertEquals(2, d.getId());
	}

	

	@Test
	public void testDeleteDepartementById() {
		deptService.deleteDepartementById(-1);	
		assertEquals(1, 1);
	}

	

    
}