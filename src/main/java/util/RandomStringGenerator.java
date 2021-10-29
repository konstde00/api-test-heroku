package util;

import org.springframework.stereotype.Service;

@Service
public interface RandomStringGenerator {
    public String getRandomString(int length);
}
