/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import com.tunaweza.law.order.model.Judge;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author azaria
 */
public interface JudgeRepository extends JpaRepository<Judge,Long> {
    
}
