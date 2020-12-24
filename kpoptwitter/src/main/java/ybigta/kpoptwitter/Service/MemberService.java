package ybigta.kpoptwitter.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ybigta.kpoptwitter.Domain.Information;
import ybigta.kpoptwitter.Repository.MemoryRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemoryRepository memoryRepository;
    

}
