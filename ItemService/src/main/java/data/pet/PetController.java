package data.pet;

import data.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PetController
{
    @RequestMapping(value ="pet/", method = RequestMethod.GET)
    @ResponseBody
    public List<Pet> getPets(){
        return petService.findAll();
    }

    @RequestMapping(value = "pet/{id}", method = RequestMethod.GET)
    @ResponseBody
    public List<Pet> findPet(@PathVariable int id){
        return petService.findPetByID(id);
    }

    @Autowired
    private PetService petService;
}
