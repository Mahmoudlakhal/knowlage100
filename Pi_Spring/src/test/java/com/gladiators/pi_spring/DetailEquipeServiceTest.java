
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import java.util.Optional;
/*
public class DetailEquipeServiceTest {

    @InjectMocks
    private DetailEquipeService detailEquipeService;

    @Mock
    private DetailEquipeRepository detailEquipeRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetEquipeById() {
        Long id = 1L;
        DetailEquipe detailEquipe = new DetailEquipe();
        detailEquipe.setIdDetailEquipe(id);

        Mockito.when(detailEquipeRepository.findById(id)).thenReturn(Optional.of(detailEquipe));

        DetailEquipe result = detailEquipeService.getEquipeById(id);

        // Vérifie si le résultat est le même que l'objet attendu
        Assertions.assertEquals(detailEquipe, result);
    }

    @Test
    public void testAddDetailEquipe() {
        DetailEquipe detailEquipe = new DetailEquipe();

        Mockito.when(detailEquipeRepository.save(Mockito.any(DetailEquipe.class))).thenReturn(detailEquipe);

        DetailEquipe result = detailEquipeService.addDetailEquipe(detailEquipe);

        // Vérifie si le résultat est le même que l'objet attendu
        Assertions.assertEquals(detailEquipe, result);
    }

    @Test
    public void testRemoveDetailEquipe() {
        Long id = 1L;

        detailEquipeService.removeDetailEquipe(id);

        // Vérifie si la méthode deleteById du repository est appelée avec le bon ID
        Mockito.verify(detailEquipeRepository).deleteById(id);
    }

    @Test
    public void testUpdateDetailEquipe() {
        Long id = 1L;
        DetailEquipe existingDetailEquipe = new DetailEquipe();
        existingDetailEquipe.setIdDetailEquipe(id);
        existingDetailEquipe.setSalle("Ancienne Salle");
        existingDetailEquipe.setThematique("Ancienne Thematique");

        DetailEquipe updatedDetailEquipe = new DetailEquipe();
        updatedDetailEquipe.setIdDetailEquipe(id);
        updatedDetailEquipe.setSalle("Nouvelle Salle");
        updatedDetailEquipe.setThematique("Nouvelle Thematique");

        Mockito.when(detailEquipeRepository.findById(id)).thenReturn(Optional.of(existingDetailEquipe));
        Mockito.when(detailEquipeRepository.save(Mockito.any(DetailEquipe.class)).thenReturn(updatedDetailEquipe);

        DetailEquipe result = detailEquipeService.updateDetailEquipe(id, updatedDetailEquipe);

        // Vérifie si le résultat est le même que l'objet attendu
        Assertions.assertEquals(updatedDetailEquipe, result);
    }
}
*/