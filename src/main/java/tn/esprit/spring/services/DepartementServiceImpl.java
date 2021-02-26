package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.transaction.annotation.Transactional;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.repository.DepartementRepository;

@Service
public class DepartementServiceImpl implements IDepartementService {

	@Autowired
	DepartementRepository deptRepository;

	private static final Logger l = LogManager.getLogger(EmployeServiceImpl.class);


	public List<Departement> getAllDepartements() {
		return (List<Departement>) deptRepository.findAll();
	}

	@Override
	public Departement addOrUpdateDep(Departement d) {
		Departement dept = deptRepository.save(d);
		return dept;
	}

	public int ajouterDepartement(Departement dep) {
		deptRepository.save(dep);
		l.info("**********Le département est ajouté avec succés " + dep);
		return dep.getId();
	}

	@Transactional
	public void deleteDepartementById(int depId) {
		if (depId < 0) {
			l.debug("*******Error,Invalide identifier********");
		} else {
			l.error("Le département avec l'identifinat " + depId + "est supprimé********");
		}
		deptRepository.delete(deptRepository.findById(depId).get());
	}
	
	

}
