interface StateRepository {
    ServerState get();
    ServerState update(ServerState state);
}