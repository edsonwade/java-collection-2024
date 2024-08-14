package code.with.vanilson.collection;

import java.util.List;
import java.util.Set;

/**
 * CollectApi
 *
 * @author vamuhong
 * @version 1.0
 * @since 2024-08-14
 */
public interface CollectApi<T> {
    List<T> getCollection();

    Set<T> removeElementInCollection();
}
