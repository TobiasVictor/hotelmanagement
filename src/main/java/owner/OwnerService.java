package owner;

import java.util.List;

public class OwnerService {
    private OwnerRepository ownerRepository;

    public OwnerService(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    /**
     * Validate Owner object and add it to the list.
     * @param owner instance
     * @return value representing a status
     */

    public String validateAndAddOwner(Owner owner) {

        boolean responseFromRepo = ownerRepository.add(owner);
        if (responseFromRepo) {
            return "Owner added with succes";
        }
        return "Revise owner parameters";
    }

    public void validateAndDeleteOwner(Owner owner) {
        ownerRepository.remove(owner);
    }

    public List<Owner> getOwners() {
        return ownerRepository.listOwners();
    }
}
