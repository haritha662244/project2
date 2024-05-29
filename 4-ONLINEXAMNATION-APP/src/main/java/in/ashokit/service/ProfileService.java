package in.ashokit.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Profile;
import in.ashokit.repo.ProfileRepository;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    public boolean updateProfile(Long userId, Profile profile) {
        Optional<Profile> optionalProfile = profileRepository.findById(userId);
        if (optionalProfile.isPresent()) {
            Profile existingProfile = optionalProfile.get();
            existingProfile.setFullName(profile.getFullName());
            existingProfile.setEmail(profile.getEmail());
            profileRepository.save(existingProfile);
            return true;
        }
        return false;
    }
    
    public boolean updatePassword(Long userId, String newPassword) {
        Optional<Profile> existingProfile = profileRepository.findById(userId);
        if (existingProfile.isPresent()) {
            Profile profile = existingProfile.get();
            profile.setPassword(newPassword);
            profileRepository.save(profile);
            return true;
        }
        return false;
}
}
