package owner;

import java.util.List;

public interface OwnerInterface {
    boolean add(Owner owner);

    void remove(Owner owner);

    List<Owner> listOwners();
}
