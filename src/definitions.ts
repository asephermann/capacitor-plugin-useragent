export interface UserAgentPlugin {
  set(options: {value: string}): Promise<{ value: string }>;
  get(): Promise<{ value: string }>;
  reset(): Promise<{ value: string }>;
}
