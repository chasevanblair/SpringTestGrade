/**
 * @author Chase Van Blair - crvanblair
 * CIS175 - Fall 2021
 * Mar 10, 2022
 */
package mod8.repository;
import mod8.beans.TestGrade;
import org.springframework.stereotype.Repository;

@Repository
public interface TestGradeRepository extends JpaRepository<TestGrade, Long>{

}

