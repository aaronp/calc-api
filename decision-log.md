# Decision Log

See [here](./decision-log-about.md) about the rationale/format for this document

# Key Decisions 

## Decision01. Contract-First (vs code-first) for REST services

### > Context: What are we trying to solve?

In the course of a micro-services project, we want to:
 *  Reduce accidental complexity - solve common problems once


    Let's not reinvent the wheel each time. Ideally we want as much of our effort as possible addressing key business value (helping customers, addressing key business concerns) rather than solving problems associated with our abstractions, processes or technologies

 *  Reduce learning curve / maximise familiarity

    We want the maximum positive impact by as many people with as little context as possible. Having to upskill / learn about frameworks, peculiar language features, or requiring awareness of additional systems/etc is something we want to minimize

 * Promote single responsibility principles

   Components and systems should do one thing well, and have clear inputs and outputs (a bounded context). We also want to decopule concepts, like data contracts decoupled from their implementation.

 * Data Strategy / Governance

   The data within a system, its impact, and its mastery and lineage are important concerns in a production environment. Divorcing the schemas and definition of behaviour from an implementation helps promote good practices and reduces risk

### > Context: Out of Scope

The decision of REST vs grpc, websockets, graphQL, etc are out-of-scope. This decision assumes we're using REST, and the best approach for contract-first REST contracts

### > Criteria: How will we evaluate our options?

What will we use to compare one solution against another?
Cost? Time? Effort? Impact? Support? Learning Curve? Risk?

Tip: You may alread have some ideas for solutions in mind which you'd like to try.
Try to reverse engineer that thought. What is it about that which you like? Why?

### > Options Considered

List any options here with a short name or number.

What are the pros/cons? If these are too detailed, perhaps link to other documentation/pages/resources.

e.g.

#### Option 1: ....

We should fizz the buzz.

Pros:

 * This option is recognised as an industry standard (see here and here).
 * ...

Cons:
 * Everyone uses it, but nobody likes it. You can hire people, but they won't be happy.
 * ...

### Evaluation

This is for a short-hand list of the above options and their weights.

Each column may have its own range:
 * Complexity: 0 to 10 from least to most, where 10 is most complex
 * Cost: The total dollar amount
 * Learning Curve: 0 to 10 from easiest to most steep (10 the hardest)

| Option        | Complexity | Cost | Learning Curve | ... |
| ------------- | ---------- | ---- | -------------- | --- |
| Fizz the Buzz | 3          | 7    | 3              | ... |
| Do Nothing    | 0          | 0    | 0              | ... |
| ...           | ...        | ...  | ...            | ... |

### Decision

Just mention:
 * Which of the above decisions did we go with
 * Who was involved in that decision
 * When 
 * And date or next steps by which time we'll revisit the decision

NOTE: Anbody should be able to review this and raise the issue with the relevant people listed
should new learning / situations arise