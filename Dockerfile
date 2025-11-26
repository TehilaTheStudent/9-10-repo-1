FROM alpine:3.19

# No failing commands, no external dependencies
RUN true

# Default command that always succeeds
CMD ["sh", "-c", "echo Container started successfully && tail -f /dev/null"]
