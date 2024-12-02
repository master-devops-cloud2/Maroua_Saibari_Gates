/*
package dcc.tp1.comptes.Service;

import dcc.tp1.comptes.Repositoty.CompteRepositoty;
import dcc.tp1.comptes.entities.Compte;
import dcc.tp1.comptes.service.CompteService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CompteTestService {

    @Mock

    private CompteRepositoty compteRepository;



    @InjectMocks
    private CompteService compteService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testCreateCompte() {
        // Arrange
        Compte compte = new Compte();
        compte.setId(1L);
        compte.setMontant(1000.0f);

        when(compteRepository.save(compte)).thenReturn(compte);

        // Act
        Compte result = compteService.CreateCompte(compte);

        // Assert
        assertNotNull(result);
        assertEquals(1000.0f, result.getMontant());
        verify(compteRepository, times(1)).save(compte);
    }

    @Test
    void testGetCompteById_ShouldReturnCompte() {
        // Arrange
        Long id = 1L;
        Compte compte = new Compte();
        compte.setId(id);
        compte.setTel("067654");
        compte.setMontant(500.0f);

        when(compteRepository.findById(id)).thenReturn(Optional.of(compte));

        // Act
        Compte result = compteService.GetCompteById(id);

        // Assert
        assertNotNull(result);
        assertEquals(500.0f, result.getMontant());
        verify(compteRepository, times(1)).findById(id);
    }

}*/
