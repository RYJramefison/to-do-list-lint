package org.folder.todolistlinter.log;

import org.folder.todolistlinter.entity.User;
import org.folder.todolistlinter.repository.MyRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class MonService  {
    private static final Logger logger = LoggerFactory.getLogger(MonService.class);
    
    private final MyRepository repository;

    public MonService(MyRepository repository) {
        this.repository = repository;
    }

    public Optional<User> getUtilisateur(Long id) {
        
        logger.debug("Début getUtilisateur avec id: {}", id);

        try {

            Optional<User> user = repository.findById(id);

            if (user.isPresent()) {
                logger.info("Utilisateur trouvé pour l'ID {}: {}", id, user.get());

                logger.debug("#perf Appel repository.findById terminé en X ms");
            } else {
                logger.warn("Aucun utilisateur trouvé pour l'ID: {}", id);
            }

            logger.debug("Fin getUtilisateur. Retourne: {}", user);
            return user;

        } catch (Exception e) {

            logger.error("Erreur lors de la récupération de l'utilisateur avec l'ID {}: {}", id, e.getMessage(), e);

            return null;
        }
    }
}


