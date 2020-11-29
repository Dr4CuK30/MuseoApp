/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.mintic.MuseoApp.repositories;

import co.com.mintic.MuseoApp.model.Presentacion;
import co.com.mintic.MuseoApp.model.PresentacionId;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author jccas
 */
public interface PresentacionRepository extends JpaRepository<Presentacion, PresentacionId>{
    
}
