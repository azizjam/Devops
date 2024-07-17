package tn.esprit.eventsproject;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import tn.esprit.eventsproject.entities.Participant;
import tn.esprit.eventsproject.repositories.EventRepository;
import tn.esprit.eventsproject.repositories.LogisticsRepository;
import tn.esprit.eventsproject.repositories.ParticipantRepository;
import tn.esprit.eventsproject.services.EventServicesImpl;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class ParticipantServiceImpTest {
    @InjectMocks

    private EventServicesImpl eventServicesImpl;
    @Mock
    private ParticipantRepository participantRepository;
    @Mock
    private LogisticsRepository logisticsRepository;
    @Mock
    private EventRepository eventRepository;

    @Test
    public  void addParticipant() {
        Participant participant = new Participant();
        when(participantRepository.save(participant)).thenReturn(participant);

        assertEquals(participant, eventServicesImpl.addParticipant(participant));
    }


}
