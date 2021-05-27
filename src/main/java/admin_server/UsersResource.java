package admin_server;
//
//public class UsersResource {
//
//}


//package admin_dashboard;



//public class UsersResource {
//
//}


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value = "/rest/users")
public class UsersResource {

@Autowired
UsersRepository usersRepository;

@GetMapping(value = "/all")
public List<Users> getAll() {
//	throw new RuntimeException();
    return usersRepository.findAll();
}
//@GetMapping(value = "/load")
//public List<Users> getPic() {
////	throw new RuntimeException();
//    return usersRepository.findAll();
//}

@PostMapping(value = "/save")
public void persist(@RequestBody final Users users) {
    usersRepository.save(users);
}

@DeleteMapping("/delete/{id}")
public ResponseEntity<Void> deleteUser(@PathVariable int id) {
	
	
	

	usersRepository.deleteById(id);
	return ResponseEntity.noContent().build();
	
//@Modifying
//@Query("delete from users2 b where b.id=:id")
//void deleteUsers(@Param("id") int id);

	
}

}