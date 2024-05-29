package in.ashokit.service;

import org.springframework.stereotype.Service;

import in.ashokit.entity.Cancellation;
import in.ashokit.repository.CancellationRepository;

@Service
public class CancellationService {
    private final CancellationRepository cancellationRepository;

    public CancellationService(CancellationRepository cancellationRepository) {
        this.cancellationRepository = cancellationRepository;
    }

    public Cancellation findByPnrNumber(String pnrNumber) {
        return cancellationRepository.findByPnrNumber(pnrNumber);
    }
}
