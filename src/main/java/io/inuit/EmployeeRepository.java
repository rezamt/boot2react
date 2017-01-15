package io.inuit;

import org.springframework.data.repository.CrudRepository;
import org.springframework.security.access.prepost.PreAuthorize;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    //PreAuthorize("hasAuthority('ROLE_ADMIN')")
    // I have simply used the href of stormpath here.
    @PreAuthorize("hasAuthority('https://api.stormpath.com/v1/groups/2tsC4r8UYv0ndZrX3xcslg')")
    @Override
    void delete(Long aLong);
}