package com.toko.online.toko.online.servis;

import com.toko.online.toko.online.modal.User;

public interface UserService {
    Object getAllUser();
    User addUser(User user);

    Object getUser(Long No);
    User editUser(Long id, String username, String email,Integer age, String adress, Integer phoneNumber);

    void deleteUserById(Long No);
}
