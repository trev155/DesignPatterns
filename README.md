# DesignPatterns
Practice with Design Patterns

Examples adapted from the book "Head First Design Patterns"

## Notes
### Strategy
The strategy pattern example is almost the exact same as the example used in the book.

### Observer
For the observer pattern, I made up my own example, simulating a news feed, where the news feed publishes a list of 
articles every day, and subscribers can access these articles. Each subscriber decides how it wants to display this data.

I use the "push" method here as well as Java's built in observer classes. If I were to use the "pull" method,
I would not pass in the articles directly from the subject to the observers. 
Instead, I would provide public methods in the subject, so that observers can access these public methods
whenever they call update().

See the book's chapter for more details!

### Decorator
I follow the example from the book very closely.

### Factory

### Singleton

### Command

