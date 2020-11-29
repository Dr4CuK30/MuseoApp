/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.mintic.MuseoApp;

import co.com.mintic.MuseoApp.model.Exposicion;
import co.com.mintic.MuseoApp.model.Museo;
import co.com.mintic.MuseoApp.model.Obra;
import co.com.mintic.MuseoApp.model.Presentacion;
import co.com.mintic.MuseoApp.repositories.MuseoRepository;
import co.com.mintic.MuseoApp.repositories.ObraRepository;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import javax.persistence.EntityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author jccas
 */

@Component
public class ExecutionExample implements CommandLineRunner {

    @Autowired
    private MuseoRepository museoRepository;
    
    @Autowired
    private ObraRepository obraRepository;
    
    private static final Logger logger = LoggerFactory.getLogger(ExecutionExample.class);
    
    @Override
    public void run(String... args) throws Exception {        
        
        
//        System.out.println("Se registró exitosamente el usuario Sparrow");
//        
//        
//        System.out.println("Se registró correctamente la pelicula Guasón");
        
                
        
//        
//        
//        Random rnd = new Random();
//        
//        logger.info(Long.toString(System.currentTimeMillis()));
//        
//        
//        
//        
//        List<Obra> obras = obraRepository.findAll();
//        for (Obra obra : obras) {
//            int n = rnd.nextInt(12);
//            Calendar c = new GregorianCalendar(1970, n, 5, 8, 25, 0);
//            obra.setFechaCreacion(c.getTime());            
//            obraRepository.save(obra);
//            
//        }
        
        
//        Optional<Obra> opt = obraRepository.findById(111L);
//        
//        if(opt.isPresent())
//        {
//            Obra o = opt.get();
//            logger.info("Nombre Obra: {}", o.getObrNombre());
//            for (Presentacion p : o.getPresentaciones()) {
//                logger.info("Presentacion: {} ", p.getPresentacionId().getPreFecha());
//            }
//            o.setFechaCreacion(new Date());
//            obraRepository.save(o);            
//            logger.info(o.getFechaCreacion().toString());
//        }
        
//        List<Obra> pinturas = obraRepository.findByObrTipoOrderByObrNombre("pintura");
//        for (Obra pintura : pinturas) {
//            logger.info(pintura.toString());
//            
//            for (Presentacion p : pintura.getPresentaciones()) {
//                logger.info("Presentacion: {} ", p.getPresentacionId().getPreFecha());
//            }
//            
//        }
//        logger.info("**************************");
//        
//        pinturas = obraRepository.miConsulta("pintura");
//        for (Obra pintura : pinturas) {
//            logger.info(pintura.toString());
//        }
//        
//        logger.info("**************************");
//        
//        List<Obra> obras1 = obraRepository.findByExposicion_ExpNombre("Cubismo");
//        for (Obra pintura : obras1) {
//            logger.info(pintura.toString());
//        }
//        
//        logger.info("**************************");
//        
//        List<Obra> obras2 = obraRepository.obrasEnMes("%ene%");
//        for (Obra pintura : obras2) {
//            logger.info(pintura.toString());
//        }
        
//        Optional<Museo> optMuseo = museoRepository.findById(101L);
//        
//        if(optMuseo.isPresent())
//            logger.info("Nombre del museo: {}", optMuseo.get().getNombreMuseo());            
//        else
//            logger.info("No existe un museo con el id especificado");
//            
//        
//        logger.info("Cantidad de museos: {}", museoRepository.count());
//        
//        List<Museo> museos = museoRepository.findAll();
//        for (Museo museo : museos) {
//            logger.info("Id: {}, Nombre: {}", museo.getMusId(), museo.getNombreMuseo());
//        }
//        
//        Museo m = new Museo();
//        m.setMusId(103L);
//        m.setNombreMuseo("Museo nacional123");        
//        museoRepository.save(m);
//        
//        List<Museo> louvres = museoRepository.findByNombreMuseo("Louvre");
//        for (Museo museo : louvres) {
//            logger.info("Id: {}, Nombre: {}", museo.getMusId(), museo.getNombreMuseo());
//        }
        
        
        
    }
    
}
