package lk.ijse.gdse.aad.ASSIGNMENT_02.api;

import lk.ijse.gdse.aad.ASSIGNMENT_02.dto.TechLeadDTO;
import lk.ijse.gdse.aad.ASSIGNMENT_02.exception.InvalidException;
import lk.ijse.gdse.aad.ASSIGNMENT_02.service.TechLeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/techlead")
public class TechLeadController {
    @Autowired
    TechLeadService techLeadService;

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    TechLeadDTO saveTechLead(  @RequestPart String tName, @RequestPart String email, @RequestPart String expertise){
       if (tName == null || !tName.matches("[A-Za-z ]+")){
           throw new InvalidException("Invalid Name");
       }else if (email == null){
           throw new InvalidException("Invalid Email");
       } else if (expertise == null){
           throw new InvalidException("Invalid Expertise");
       }

       TechLeadDTO tmpTechlead = new TechLeadDTO();
        tmpTechlead.setTName(tName);
        tmpTechlead.setEmail(email);
        tmpTechlead.setExpertise(expertise);

        return techLeadService.saveTechLead(tmpTechlead);

    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("{tId}")
    void deleteTechLead(@PathVariable String tId){
        techLeadService.deleteTechLead(tId);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PatchMapping("{tId}")
    void updateTechLead( @PathVariable String tId, @RequestPart String tName, @RequestPart String email, @RequestPart String expertise){
        if (tName == null || !tName.matches("[A-Za-z ]+")){
            throw new InvalidException("Invalid Name");
        }else if (email == null){
            throw new InvalidException("Invalid Email");
        } else if (expertise == null){
            throw new InvalidException("Invalid Expertise");
        }else if (!tId.matches("[A-Fa-f0-9\\-]{36}")) {
            throw new InvalidException("Invalid Employee Id");
        }

        TechLeadDTO updateTechlead = new TechLeadDTO();
        updateTechlead.setTName(tName);
        updateTechlead.setEmail(email);
        updateTechlead.setExpertise(expertise);
        techLeadService.updateTechLead(tId,updateTechlead);
    }

    @GetMapping(value = "{iId}",produces = MediaType.APPLICATION_JSON_VALUE)
    TechLeadDTO getSelectedEmp(@PathVariable String tId){
        if(!tId.matches("[A-Fa-f0-9\\-]{36}")) throw new InvalidException("Id is invalid");
        return techLeadService.getTechLeadById(tId);
    }

}
