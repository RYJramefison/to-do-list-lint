package org.folder.todolistlinter.log;

import org.folder.todolistlinter.entity.User;
import org.folder.todolistlinter.repository.MyRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;


public class MonService {
    private static final Logger logger = LoggerFactory.getLogger(MonService.class);
    
    private final MyRepository repository;

    public MonService(MyRepository repository) {
        this.repository = repository;
    }

    public Optional<User> getUtilisateur(Long id) {
        
        logger.debug("Début getUtilisateur avec id: {}", id);

        try {
            // 2. Appel au Repository
            Optional<User> user = repository.findById(id);

            // 3. Log le résultat trouvé ou non (niveau INFO/DEBUG)
            if (user.isPresent()) {
                logger.info("Utilisateur trouvé pour l'ID {}: {}", id, user.get());
                // 4. Optionnel : Log de performance
                logger.debug("#perf Appel repository.findById terminé en X ms");
            } else {
                logger.warn("Aucun utilisateur trouvé pour l'ID: {}", id);
            }

            // 5. Log la sortie de la méthode avec la valeur retournée
            logger.debug("Fin getUtilisateur. Retourne: {}", user);
            return user;

        } catch (Exception e) {
            // 6. Log l'erreur avec l'exception (niveau ERROR/WARN)
            // Utilisez e.getMessage() et l'objet exception pour le contexte
            logger.error("Erreur lors de la récupération de l'utilisateur avec l'ID {}: {}", id, e.getMessage(), e);
            // 7. Ne jamais utiliser System.out.println ou e.printStackTrace() directement !
            // Loggez toujours l'exception via le logger.
            return null; // ou relancer une exception spécifique
        }
    }
}


