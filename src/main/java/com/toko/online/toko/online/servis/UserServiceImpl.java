package com.toko.online.toko.online.servis;


import com.toko.online.toko.online.exception.InternalErrorException;
import com.toko.online.toko.online.exception.NotFoundException;
import com.toko.online.toko.online.modal.User;
import com.toko.online.toko.online.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public Object getAllUser() {
        try {
            return userRepository.findAll();
        } catch (Exception e) {
            System.out.println("kamu nanya eror nya dimana");
            return "Kesalahan memunculkan data";
        }
    }


    @Override
    public User addUser(User user) {
      if(userRepository.findByEmial(user.getEmail()).isPresent()){
          throw new InternalErrorException("Email sudah ada");
      }
        return userRepository.save(user);

    }

    @Override
    public Object getUser(Long No) {

        try {
            var user = userRepository.findById(No).orElseThrow(() -> new NotFoundException("id Tidak ditemukan"));

            return userRepository.save(user);
        } catch (Exception b) {
         throw new InternalErrorException("ada yang terdapat null");
        }
    }

    @Override
    public User editUser(Long id, String username, String email, Integer age, String adress, Integer phoneNumber) {
        User user = userRepository.findById(id).get();
        user.setUsername(username);
        user.setEmail(email);
        user.setAge(age);
        user.setAdress(adress);
        user.setPhoneNumber(phoneNumber);

        return userRepository.save(user);
    }

    @Override
    public void deleteUserById(Long No) {
        userRepository.deleteById(No);
    }

}
