/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.mintic.MuseoApp.repositories;

import co.com.mintic.MuseoApp.model.Exposicion;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author jccas
 */
public interface ExposicionRepository extends JpaRepository<Exposicion, Long> {
    
}
