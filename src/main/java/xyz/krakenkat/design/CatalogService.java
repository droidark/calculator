package xyz.krakenkat.design;

import xyz.krakenkat.model.IdAris;

public interface CatalogService {
    void create(IdAris id);
    void read(IdAris id);
    void update(IdAris id);
    void delete(IdAris id);
}
