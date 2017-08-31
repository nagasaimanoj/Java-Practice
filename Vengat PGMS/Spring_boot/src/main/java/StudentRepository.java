import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface StudentRepository extends Repository<Student, Integer>, JpaRepository<Student, Integer> {
    @Query("select s.name,s.rollno,d.dept_name from Student s left join s.dept_id d where ((d.dept_name=:dept and s.rollno=:id) or (d.dept_name=:dept or s.rollno=''))")
    public List<Student> getbydept(@Param("dept") String department, @Param("id") String id);
}