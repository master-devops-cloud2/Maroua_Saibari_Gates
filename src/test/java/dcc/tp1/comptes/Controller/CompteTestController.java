/*
package dcc.tp1.comptes.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import dcc.tp1.comptes.controller.CompteController;
import dcc.tp1.comptes.entities.Compte;
import dcc.tp1.comptes.service.CompteService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;
        import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
        import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(CompteController.class)
class CompteTestController{

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CompteService compteService;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void testGetAllComptes() throws Exception {
        // Arrange
        Compte compte1 = new Compte(1L, "Compte1","067654", 1000.0f);
        Compte compte2 = new Compte(2L, "Compte2","067654", 2000.0f);
        List<Compte> comptes = Arrays.asList(compte1, compte2);

        when(compteService.GetAllCompte()).thenReturn(comptes);

        // Act & Assert
        mockMvc.perform(get("/v1/Comptes")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].id").value(1))
                .andExpect(jsonPath("$[0].montant").value(1000.0f))
                .andExpect(jsonPath("$[1].id").value(2))
                .andExpect(jsonPath("$[1].montant").value(2000.0f));

        verify(compteService, times(1)).GetAllCompte();
    }

    @Test
    void testAddCompte() throws Exception {
        // Arrange
        Compte compte = new Compte(1L, "Compte1","067654", 1000.0f);

        when(compteService.CreateCompte(any(Compte.class))).thenReturn(compte);

        // Act & Assert
        mockMvc.perform(post("/v1/Comptes")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(compte)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.montant").value(1000.0f));

        verify(compteService, times(1)).CreateCompte(any(Compte.class));
    }
}*/
