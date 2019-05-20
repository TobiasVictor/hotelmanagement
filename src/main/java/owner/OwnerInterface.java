package owner;

import java.util.List;

public interface OwnerInterface {
    /**
     * Add owner.
     * @param owner instance
     * @return true is inserted
     */




    boolean add(Owner owner);

    void remove(Owner owner);

    List<Owner> listOwners();
}
