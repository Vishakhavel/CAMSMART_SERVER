package admin_server;
//
//public interface UsersRepository {
//
//}


//package admin_dashboard;
//
//public interface UsersRepository {
//
//}



//public interface UsersRepository {
//
//}



//import com.techprimers.db.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
