package in.ashokit.service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findByUserId(String userId) {
        return userRepository.findByUserId(userId);
    }

    @Override
    public boolean isValidUser(String userId, String pin) {
        User user = findByUserId(userId);
        return user != null && user.getPin().equals(pin);
    }
}