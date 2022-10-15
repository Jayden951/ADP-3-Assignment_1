/*
SupportStaff.java
Enable services
Author: Tiffany Kiwiets (219322732)
*/

package za.ac.cput.services.Impl.StaffDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.StaffDetails.SupportStaff;
import za.ac.cput.repository.StaffDetailsRepo.ISupportStaffRepository;
import za.ac.cput.services.Interface.StaffDetails.ISupportStaff;

import java.util.List;
import java.util.Optional;
@Service
public class SupportStaffImpl implements ISupportStaff {
    private final ISupportStaffRepository repository;

    @Autowired public SupportStaffImpl(ISupportStaffRepository repository) { this.repository = repository; }

    @Override
    public List<SupportStaff> findall() { return this.repository.findAll(); }

    @Override
    public SupportStaff save(SupportStaff supportStaff) { return this.repository.save(supportStaff); }

    @Override
    public Optional<SupportStaff> read(String s) { return this.repository.findById(s); }

    @Override
    public void delete(SupportStaff supportStaff) { this.repository.delete(supportStaff); }
}
