package owner;

import java.util.ArrayList;
import java.util.List;

public class OwnerRepository implements OwnerInterface {
    private List<Owner> owners = new ArrayList<>();

    @Override
    public boolean add(Owner owner) {
        owners.add(owner);

        return true;
    }

    @Override
    public void remove(Owner owner) {
        owners.remove(owner);
    }

    @Override
    public List<Owner> listOwners() {
        return owners;
    }
}
